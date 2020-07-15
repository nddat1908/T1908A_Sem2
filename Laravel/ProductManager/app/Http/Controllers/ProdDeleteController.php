<?php


namespace App\Http\Controllers;

use Illuminate\Http\Request;
use DB;
use App\Http\Requests;
use App\Http\Controllers\Controller;
class ProdDeleteController extends Controller
{
    public function index(){
        $sers = DB::select('select * from products');
        return view('prod_delete_view',['users'=>$sers]);
    }
    public function destroy($id) {
        DB::delete('delete from products where id = ?',[$id]);
        return redirect('delete-records')->with('delete','Record deleted successfully.');
    }
}
