module.exports = function () {

  this.Given(/^I have an account$/, function (callback) {
    callback.pending();
  });

  this.When(/^I attempt to register for online banking$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (accountsetuphasbeensuccessful, callback) {
    callback.pending();
  });

  this.Then(/^I am informed: \"([^\"]*)\"$/, function (yourpasswordsdonotmatchpleasecheckthemandtryagain, callback) {
    callback.pending();
  });

  this.And(/^I have made a request for online banking$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have received a confirmation code by post$/, function (callback) {
    callback.pending();
  });

  this.And(/^I have received a one time password by post$/, function (callback) {
    callback.pending();
  });

  this.And(/^I use the confirmation code: \"([^\"]*)\"$/, function (123456789, callback) {
    callback.pending();
  });

  this.And(/^I use the password: \"([^\"]*)\"$/, function (blahblah55, callback) {
    callback.pending();
  });

  this.And(/^I have received one time password by post$/, function (callback) {
    callback.pending();
  });

  this.And(/^I use: (.+)$/, function (badconfirmationcode, callback) {
    callback.pending();
  });

  this.And(/^I have received by post: (.+)$/, function (confirmationcode, callback) {
    callback.pending();
  });

};