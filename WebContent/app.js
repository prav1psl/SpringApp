
'use strict';

angular.module('enrollment', ['ngRoute','enrollment.enrollmentControllers','enrollment.services']).
config(['$routeProvider', function($routeProvider) {
    // Set defualt view of our app to home
    $routeProvider.  
    when('/enroll', {
        templateUrl: 'views/enrollment.html',
        controller: 'enrollmentCtrl'
      }).otherwise({
        redirectTo: 'empEnrollment.html',
        controller : 'enrollmentCtrl'
    });
}]);