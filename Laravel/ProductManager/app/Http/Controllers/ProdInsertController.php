<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use App\Http\Requests;
use App\Http\Controllers\Controller;

class ProdInsertController extends Controller
{
    public function insertform(){
        return view('prod_create');
    }
    public function insert(Request $request){
        $name = $request->input('product_name');
        $price = $request->input('price');
        $img = $request->input('img');

        $data=array('product_name'=>$name,"price"=>$price,"img"=>$img);
        DB::table('products')->insert($data);
        echo "Record inserted successfully.<br/>";
        echo '<a href = "/ProductManager/public/insert">Click Here</a> to go back.';
    }
}
