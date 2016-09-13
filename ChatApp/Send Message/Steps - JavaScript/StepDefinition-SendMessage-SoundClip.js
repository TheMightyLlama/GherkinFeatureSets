module.exports = function () {

  this.Given(/^I have an account$/, function (callback) {
    callback.pending();
  });

  this.When(/^I record a clip$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be able to listen to it$/, function (callback) {
    callback.pending();
  });

  this.Then(/^the clip should be sent immediately to \"([^\"]*)\"$/, function (bob, callback) {
    callback.pending();
  });

  this.And(/^I have a contact named: \"([^\"]*)\"$/, function (bob, callback) {
    callback.pending();
  });

  this.And(/^I send it to \"([^\"]*)\"$/, function (bob, callback) {
    callback.pending();
  });

  this.And(/^\"([^\"]*)\" should be able to listen to it$/, function (bob, callback) {
    callback.pending();
  });

  this.And(/^I attempt to record more than 1 minute of audio$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to listen to it$/, function (callback) {
    callback.pending();
  });

};