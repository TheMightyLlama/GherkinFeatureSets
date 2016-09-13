Given /^a user \"([^\"]*)\"$/" do |alice|
    # do something
end

Given /^I am logged in as \"([^\"]*)\"$/" do |alice|
    # do something
end

When /^I post the Text String (.+)$/ do |string|
    # do something
end

Then /^I should see the Text String (.+)$/ do |string|
    # do something
end

And /^a user \"([^\"]*)\"$/" do |bob|
    # do something
end

And /^\"([^\"]*)\"" should see the Text String (.+)$/ do |string, bob|
    # do something
end

