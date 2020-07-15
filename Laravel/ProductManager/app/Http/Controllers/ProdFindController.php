<?php


namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use App\Http\Requests;
use App\Http\Controllers\Controller;

class ProdFindController extends Controller
{
    public function index(){
        $sers = DB::select('select * from products ');
        return view('prod_find',['users'=>$sers]);
    }


    public function search($id) {
        DB::select('select * from products WHERE id = ? ',[$id]);
        return redirect('search')->with('Find','Record find successfully.');
    }
}
