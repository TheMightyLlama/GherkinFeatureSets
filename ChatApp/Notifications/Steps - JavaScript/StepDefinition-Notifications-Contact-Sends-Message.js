module.exports = function () {

  this.Given(/^I have an account$/, function (callback) {
    callback.pending();
  });

  this.When(/^Bob sends me a message$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should receive a notification showing the first 30 characters$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (bobhassentyoualocation, callback) {
    callback.pending();
  });

  this.And(/^I have the ChatApp in the background$/, function (callback) {
    callback.pending();
  });

  this.And(/^Bob is a contact$/, function (callback) {
    callback.pending();
  });

  this.And(/^it is only text$/, function (callback) {
    callback.pending();
  });

  this.And(/^it has an emoji$/, function (callback) {
    callback.pending();
  });

  this.And(/^it should show the emoji$/, function (callback) {
    callback.pending();
  });

  this.And(/^it contains a location$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to open it in google maps$/, function (callback) {
    callback.pending();
  });

  this.And(/^it contains a sound clip$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able listen to it.$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able view it.$/, function (callback) {
    callback.pending();
  });

  this.And(/^it contains a web link$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be redirected to it.$/, function (callback) {
    callback.pending();
  });

};