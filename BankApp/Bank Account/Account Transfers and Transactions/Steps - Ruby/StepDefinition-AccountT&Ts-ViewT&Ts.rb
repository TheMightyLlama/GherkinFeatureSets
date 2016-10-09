Given /^the following user:$/ do 
    # do something
end

Given /^I am logged in as Bob$/ do 
    # do something
end

When /^I view my statement$/ do 
    # do something
end

When /^I make a transaction$/ do 
    # do something
end

Then /^I should be informed: \"([^\"]*)\"$/" do |youhavenotyetmadeanytransfersortransactions|
    # do something
end

Then /^I should be able to see the ID of the transaction, the (.+), the (.+) and (.+)$/ do |type, value, balance|
    # do something
end

And /^I have not made any transactions or transfers against my account$/ do 
    # do something
end

And /^my balance is: £1000.00$/ do 
    # do something
end

And /^the transaction or transfer of type: (.+)$/ do |type|
    # do something
end

And /^the transaction is for: (.+)$/ do |value|
    # do something
end

