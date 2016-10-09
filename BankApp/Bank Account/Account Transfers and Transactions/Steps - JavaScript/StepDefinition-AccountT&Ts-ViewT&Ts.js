module.exports = function () {

  this.Given(/^the following user:$/, function (callback) {
    callback.pending();
  });

  this.Given(/^I am logged in as Bob$/, function (callback) {
    callback.pending();
  });

  this.When(/^I view my statement$/, function (callback) {
    callback.pending();
  });

  this.When(/^I make a transaction$/, function (callback) {
    callback.pending();
  });

  this.Then(/^I should be informed: \"([^\"]*)\"$/, function (youhavenotyetmadeanytransfersortransactions, callback) {
    callback.pending();
  });

  this.Then(/^I should be able to see the ID of the transaction, the (.+), the (.+) and (.+)$/, function (type, value, balance, callback) {
    callback.pending();
  });

  this.And(/^I have not made any transactions or transfers against my account$/, function (callback) {
    callback.pending();
  });

  this.And(/^my balance is: £1000.00$/, function (callback) {
    callback.pending();
  });

  this.And(/^the transaction or transfer of type: (.+)$/, function (type, callback) {
    callback.pending();
  });

  this.And(/^the transaction is for: (.+)$/, function (value, callback) {
    callback.pending();
  });

};