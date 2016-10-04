module.exports = function () {

  this.Given(/^the following user:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as Bob$/, function (callback) {
    callback.pending();
  });

  this.When(/^I view my active cards$/, function (callback) {
    callback.pending();
  });

  this.When(/^I view my cards$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (youhavenotyetrequestedanycards, callback) {
    callback.pending();
  });

  this.Then(/^I should be able to see the following cards:$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have not requested any cards against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have requested cards against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have cancelled the card: 12345678901$/, function (callback) {
    callback.pending();
  });

  this.And(/^todays date is: 11/09/2020$/, function (callback) {
    callback.pending();
  });

};