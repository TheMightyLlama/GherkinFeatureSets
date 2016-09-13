module.exports = function () {

  this.Given(/^a user with the username: \"([^\"]*)\"$/, function (firstnamelastname, callback) {
    callback.pending();
  });

  this.Given(/^I use the username: \"([^\"]*)\"$/, function (firstnamelastname, callback) {
    callback.pending();
  });

  this.Given(/^I use the username: (.+)$/, function (username, callback) {
    callback.pending();
  });

  this.When(/^I attempt to login$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be given access to the service$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed that the password I have entered is incorrect$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed that: \"([^\"]*)\"$/, function (theemailaddressorphonenumberthatyouveentereddoesntmatchanyaccountsignupforanaccount, callback) {
    callback.pending();
  });

  this.And(/^a password: \"([^\"]*)\"$/, function (shortpass, callback) {
    callback.pending();
  });

  this.And(/^I use the password: \"([^\"]*)\"$/, function (shortpass, callback) {
    callback.pending();
  });

  this.And(/^I use the password: (.+)$/, function (password, callback) {
    callback.pending();
  });

};