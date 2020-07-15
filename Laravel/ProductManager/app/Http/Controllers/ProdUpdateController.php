<?php


namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use App\Http\Requests;
use App\Http\Controllers\Controller;
class ProdUpdateController extends Controller
{
    public function index(){
        $users = DB::select('SELECT * FROM products');
        return view('prod_edit_view',['users'=>$users]);
    }
    public function show($id) {
        $users = DB::select('SELECT * FROM products WHERE id = ?',[$id]);
        return view('prod_update',['users'=>$users]);
    }
    public function edit(Request $request,$id) {
        $name = $request->input('product_name');
        $price = $request->input('price');
        $img = $request->input('img');
        DB::update('UPDATE products SET product_name = ?,price=?,img=? WHERE id = ?',[$name,$price,$img,$id]);

        echo "Record updated successfully.";
        echo '<a href = "/ProductManager/public/edit-records">Click Here</a> to go back.';
    }
}
