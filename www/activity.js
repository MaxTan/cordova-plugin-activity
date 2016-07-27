var exec = require('cordova/exec');

exports.run = function (uri, success, error) {
    exec(success, error, 'ActivityPlugin', 'run', [uri]);
};