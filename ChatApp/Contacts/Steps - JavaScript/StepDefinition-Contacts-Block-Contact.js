module.exports = function () {

  this.Given(/^I have an account$/, function (callback) {
    callback.pending();
  });

  this.When(/^I choose to block them$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should not receive messages from them$/, function (callback) {
    callback.pending();
  });

  this.And(/^I am linked with a contact$/, function (callback) {
    callback.pending();
  });

  this.And(/^they should not be able to send messages to me$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should not be able to send messages to them$/, function (callback) {
    callback.pending();
  });

};