module.exports = function () {

  this.Given(/^the following user:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as Bob$/, function (callback) {
    callback.pending();
  });

  this.When(/^I want to download transactions or transfers against my account$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am not able to perform a download$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be able to start a download$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have no transactions or transfers against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have transactions or transfers against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should download a csv file of my transactions and transfers$/, function (callback) {
    callback.pending();
  });

};
