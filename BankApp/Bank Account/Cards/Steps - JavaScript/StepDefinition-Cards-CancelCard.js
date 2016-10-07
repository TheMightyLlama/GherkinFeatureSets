module.exports = function () {

  this.Given(/^the following user:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as Bob$/, function (callback) {
    callback.pending();
  });

  this.When(/^I cancel the card$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (yourcardhasbeencancelledanditwillnolongerbepossibletouseit, callback) {
    callback.pending();
  });

  this.And(/^I have requested a cards against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to see my cards number$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to see my cards expiry date$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to see my cards status has been set to \"([^\"]*)\"$/, function (cancelled, callback) {
    callback.pending();
  });

};