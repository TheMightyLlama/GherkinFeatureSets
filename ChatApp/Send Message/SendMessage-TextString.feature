Feature: Sharing a Text String
    As a ChatApp user
    I want to send a contact a sentence
    So that we can swap information about anything

    Background:
        Given a user "Alice"
        And a user "Bob"

    Scenario Outline: Alice shares a text string
        Given I am logged in as "Alice"
        When I post the Text String <string>
        Then I should see the Text String <string>
        And "Bob" should see the Text String <string>

    Examples: 
        | <language> | <string>                                                                                                                               |  
        | english    | the quick brown fox jumps over the lazy dog                                                                                            |  
        | spanish    | Benjamín pidió una bebida de kiwi y fresa; Noé, sin vergüenza, la más exquisita champaña del menú.                                     |  
        | french     | Ça me fait peur de fêter noël là, sur cette île bizarroïde où une mère et sa môme essaient de me tuer avec un gâteau à la cigüe brûlé. |  
        | italian    | Ma la volpe, col suo balzo, ha raggiunto il quieto Fido.                                                                               |  
        | portuguese | Zebras caolhas de Java querem passar fax para moças gigantes de New York                                                               |  
        | german     | Victor jagt zwölf Boxkämpfer quer über den großen Sylter Deich                                                                         |  
