module.exports = function () {

  this.Given(/^I have an account$/, function (callback) {
    callback.pending();
  });

  this.When(/^they register an account with the number 555-1234$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should receive a notification saying: \"([^\"]*)\"$/, function (bobhasjoinedsayhi, callback) {
    callback.pending();
  });

  this.And(/^I have a contact with the details:$/, function (callback) {
    callback.pending();
  });

};