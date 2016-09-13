module.exports = function () {

  this.Given(/^a user \"([^\"]*)\"$/, function (alice, callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as \"([^\"]*)\"$/, function (alice, callback) {
    callback.pending();
  });

  this.When(/^I post the Text String (.+)$/, function (string, callback) {
    callback.pending();
  });

  this.Then(/^I should see the Text String (.+)$/, function (string, callback) {
    callback.pending();
  });

  this.And(/^a user \"([^\"]*)\"$/, function (bob, callback) {
    callback.pending();
  });

  this.And(/^\"([^\"]*)\" should see the Text String (.+)$/, function (string, , callbackbob, callback) {
    callback.pending();
  });

};