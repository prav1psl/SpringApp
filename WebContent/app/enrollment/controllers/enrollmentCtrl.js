'use strict';

angular.module('enrollment.enrollmentControllers', ['ngRoute']).controller('enrollmentCtrl', ['$rootScope', '$scope', '$http','EnrollmentService',
function($rootScope, $scope, $http,EnrollmentService) {
	 $scope.gender = [
	                  {name:'Female'} ,
	                  {name:'Male'}
	                  ];
	$scope.submited = false;
	$scope.addEmployee = function(valid) {
		$scope.submited = true;
		if(valid){
			alert(JSON.stringify($scope.employee));
			EnrollmentService.save($scope.employee, function(response) { 
			alert("Sucess");
			
			},function(error){
			alert("Error")
			});
			
		}
	}
}]);
