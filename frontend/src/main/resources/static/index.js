angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:19211/front';

    $scope.loadProducts = function () {
        $http({
            url: contextPath + '/products',
            method: 'GET'
        }).then(function (response) {
            $scope.products = response.data;
            console.log(response.data);
        });
    };


    $scope.loadProducts();
});