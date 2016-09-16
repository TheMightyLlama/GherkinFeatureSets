module.exports = function () {

  this.Given(/^a user with the username \"([^\"]*)\"$/, function (foochatappcom, callback) {
    callback.pending();
  });

  this.Given(/^I am not logged into the ChatApp$/, function (callback) {
    callback.pending();
  });

  this.When(/^I attempt to login$/, function (callback) {
    callback.pending();
  });

  this.When(/^I attempt the login 3 times$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be given access to the service$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (theemailandpasswordcombindationdoesnotmatchanaccountpleasetryagain, callback) {
    callback.pending();
  });

  this.Then(/^I am informed that the username I am attempting has not been registered$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed that I have made too many attempts$/, function (callback) {
    callback.pending();
  });

  this.And(/^a password \"([^\"]*)\"$/, function (goodpass, callback) {
    callback.pending();
  });

  this.And(/^I use the email address: \"([^\"]*)\"$/, function (foochatappcom, callback) {
    callback.pending();
  });

  this.And(/^I use the password: \"([^\"]*)\"$/, function (goodpass, callback) {
    callback.pending();
  });

  this.And(/^I use the email address: (.+)$/, function (email, callback) {
    callback.pending();
  });

  this.And(/^I use the password: (.+)$/, function (password, callback) {
    callback.pending();
  });

  this.And(/^I should be prompted to register with (.+)$/, function (email, callback) {
    callback.pending();
  });

  this.And(/^I attempt to login$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be informed that I can only attempt to login from my ip after five minutes$/, function (callback) {
    callback.pending();
  });

};