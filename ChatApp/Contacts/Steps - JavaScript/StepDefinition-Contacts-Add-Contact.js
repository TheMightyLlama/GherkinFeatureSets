module.exports = function () {

  this.Given(/^I have an account$/, function (callback) {
    callback.pending();
  });

  this.When(/^I am sent a message from someone$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be able to add them to my local address book$/, function (callback) {
    callback.pending();
  });

  this.And(/^I do no have their contact details$/, function (callback) {
    callback.pending();
  });

};