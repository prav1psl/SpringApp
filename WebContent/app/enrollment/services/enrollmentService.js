'use strict';

angular.module('enrollment.services',['ngResource'])
	.factory('EnrollmentService', function($resource) { 
		 return $resource('/SpringRestApp/employee/enrollment.htm');
	});

