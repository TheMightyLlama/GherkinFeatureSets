module.exports = function () {

  this.Given(/^the following user:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as Bob$/, function (callback) {
    callback.pending();
  });

  this.When(/^I request a new card$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (youwillreceiveyourcardinthepostshortly, callback) {
    callback.pending();
  });

  this.Then(/^I should be asked: \"([^\"]*)\"$/, function (yourexistingcardwillbeautomaticallycancelleddoyouwishtoproceed, callback) {
    callback.pending();
  });

  this.And(/^I have not requested any cards against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to see my cards number$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to see my cards expiry date$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be able to see my cards status$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have requested cards against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^I should be informed: \"([^\"]*)\"$/, function (youwillreceiveyourcardinthepostshortly, callback) {
    callback.pending();
  });

};