<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});
//List Product
Route::get('/list',function (){
   return view('prod_list');
});

//Insert Product
Route::get('insert','ProdInsertController@insertform');
Route::post('create','ProdInsertController@insert');
//Update Product
Route::get('edit-records','ProdUpdateController@index');
Route::get('edit/{id}','ProdUpdateController@show');
Route::post('edit/{id}','ProdUpdateController@edit');
//Delete Product
Route::get('delete-records','ProdDeleteController@index');
Route::get('delete/{id}','ProdDeleteController@destroy');
//Search Product
Route::get('find','ProdFindController@index');
Route::get('search/{id}','ProdFindController@search');
