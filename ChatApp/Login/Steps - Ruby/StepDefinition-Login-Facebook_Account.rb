Given /^a user with the username: \"([^\"]*)\"$/" do |firstnamelastname|
    # do something
end

Given /^I use the username: \"([^\"]*)\"$/" do |firstnamelastname|
    # do something
end

Given /^I use the username: (.+)$/ do |username|
    # do something
end

When /^I attempt to login$/ do 
    # do something
end

Then /^I should be given access to the service$/ do 
    # do something
end

Then /^I should be informed that the password I have entered is incorrect$/ do 
    # do something
end

Then /^I should be informed that: \"([^\"]*)\"$/" do |theemailaddressorphonenumberthatyouveentereddoesntmatchanyaccountsignupforanaccount|
    # do something
end

And /^a password: \"([^\"]*)\"$/" do |shortpass|
    # do something
end

And /^I use the password: \"([^\"]*)\"$/" do |shortpass|
    # do something
end

And /^I use the password: (.+)$/ do |password|
    # do something
end

