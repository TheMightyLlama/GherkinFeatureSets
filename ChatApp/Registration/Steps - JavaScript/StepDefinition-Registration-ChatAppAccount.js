module.exports = function () {

  this.Given(/^I do not have a chat app account$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I have a chat app account$/, function (callback) {
    callback.pending();
  });

  this.When(/^I attempt to register with the email address: (.+)$/, function (email, callback) {
    callback.pending();
  });

  this.When(/^I attempt to register with the email address: \"([^\"]*)\"$/, function (alicethechatappcom, callback) {
    callback.pending();
  });

  this.Then(/^I should be sent a registration email$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed \"([^\"]*)\"$/, function (emailisnotavalidformat, callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (anaccountalreadyexistswiththisemailaddressresetpassword, callback) {
    callback.pending();
  });

  this.And(/^I attempt to register with the password: (.+)$/, function (password, callback) {
    callback.pending();
  });

  this.And(/^I use the email address: \"([^\"]*)\"$/, function (alicethechatappcom, callback) {
    callback.pending();
  });

};