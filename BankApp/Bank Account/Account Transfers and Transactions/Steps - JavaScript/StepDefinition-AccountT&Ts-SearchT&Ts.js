module.exports = function () {

  this.Given(/^the following user:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as Bob$/, function (callback) {
    callback.pending();
  });

  this.When(/^I search for (.+) with (.+)$/, function (criteria, searchvalue, callback) {
    callback.pending();
  });

  this.Then(/^I am informed: \"([^\"]*)\".$/, function (therearenoresultsthatmatchyourcriteria, callback) {
    callback.pending();
  });

  this.Then(/^I should be able to see ID of the transaction, the (.+), the (.+) and (.+)$/, function (type, value, balance, callback) {
    callback.pending();
  });

  this.And(/^the following transactions:$/, function (callback) {
    callback.pending();
  });

  this.And(/^my balance is £1000.00$/, function (callback) {
    callback.pending();
  });

};
