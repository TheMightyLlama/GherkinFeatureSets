module.exports = function () {

  this.Given(/^the following users:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as: (.+)$/, function (username, callback) {
    callback.pending();
  });

  this.When(/^I edit my telephone address with the number: (.+)$/, function (number, callback) {
    callback.pending();
  });

  this.When(/^I edit my telephone address with the details:$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am able to save it$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am informed: \"([^\"]*)\"$/, function (youhavemissedoutsomefieldspleaseensuretheyarefilledin, callback) {
    callback.pending();
  });

  this.And(/^I have stated my telephone address as being in: (.+)$/, function (country, callback) {
    callback.pending();
  });

  this.And(/^my country has the international dialling code: (.+)$/, function (code, callback) {
    callback.pending();
  });

  this.And(/^the bank can call me at: \"([^\"]*)\"$/, function (code, number, , callback00codenumber, callback) {
    callback.pending();
  });

  this.And(/^I have stated my telephone addres as being in: (.+)$/, function (country, callback) {
    callback.pending();
  });

};