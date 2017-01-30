Given /^the following user:$/ do 
    # do something
end

Given /^I am logged in as Bob$/ do 
    # do something
end

When /^I search for (.+) with (.+)$/ do |criteria, searchvalue|
    # do something
end

Then /^I am informed: \"([^\"]*)\\".$/ do |therearenoresultsthatmatchyourcriteria|
    # do something
end

Then /^I should be able to see ID of the transaction, the (.+), the (.+) and (.+)$/ do |type, value, balance|
    # do something
end

And /^the following transactions:$/ do 
    # do something
end

And /^my balance is £1000.00$/ do 
    # do something
end

