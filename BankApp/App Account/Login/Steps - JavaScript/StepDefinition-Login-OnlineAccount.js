module.exports = function () {

  this.Given(/^a user with the credentials:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am not logged into the BankApp$/, function (callback) {
    callback.pending();
  });

  this.When(/^I attempt to login as: \"([^\"]*)\"$/, function (username12345, callback) {
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

  this.And(/^I use the password: \"([^\"]*)\"$/, function (badpass, callback) {
    callback.pending();
  });

  this.And(/^I use the username: \"([^\"]*)\"$/, function (nonexistentusername, callback) {
    callback.pending();
  });

  this.And(/^I should be prompted: \"([^\"]*)\"$/, function (pleasecontactyourbankonxxxxxxxxx, callback) {
    callback.pending();
  });

  this.And(/^I attempt to login$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be informed that my account has been locked$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be informed: \"([^\"]*)\"$/, function (pleasecontactyourbankonxxxxxxxxx, callback) {
    callback.pending();
  });

};