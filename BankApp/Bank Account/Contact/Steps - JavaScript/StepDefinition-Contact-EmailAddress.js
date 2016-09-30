module.exports = function () {

  this.Given(/^the following users:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as: (.+)$/, function (username, callback) {
    callback.pending();
  });

  this.When(/^I edit my email address to: (.+)$/, function (email, callback) {
    callback.pending();
  });

  this.When(/^I attempt to save it$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am able to save it$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am not able to save it$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am informed: \"([^\"]*)\"$/, function (youremailaddresscannotbeemptypleasefillthefield, callback) {
    callback.pending();
  });

  this.And(/^the bank can send me emails at: (.+)$/, function (email, callback) {
    callback.pending();
  });

  this.And(/^I am informed: \"([^\"]*)\"$/, function (theemailaddressisnotformattedcorrectlypleasetryagain, callback) {
    callback.pending();
  });

  this.And(/^I have set my email address as empty$/, function (callback) {
    callback.pending();
  });

};