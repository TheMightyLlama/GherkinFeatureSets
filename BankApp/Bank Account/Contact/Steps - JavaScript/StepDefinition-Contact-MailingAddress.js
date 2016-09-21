module.exports = function () {

  this.Given(/^the following users:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as: (.+)$/, function (username, callback) {
    callback.pending();
  });

  this.When(/^I edit my address with the details:$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am able to save it$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I am informed: \"([^\"]*)\"$/, function (youhavemissedoutsomefieldspleaseensuretheyarefilledin, callback) {
    callback.pending();
  });

  this.And(/^I have stated my mailing address as being in: (.+)$/, function (country, callback) {
    callback.pending();
  });

  this.And(/^correspondence goes to the (.+) address$/, function (country, callback) {
    callback.pending();
  });

  this.And(/^I have stated my malining addres as being in: (.+)$/, function (country, callback) {
    callback.pending();
  });

};