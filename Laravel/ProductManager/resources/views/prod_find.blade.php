<!DOCTYPE html>
<html>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<head>
    <title>Find Product</title>
</head>
<body>
<form action="{{url('search')}}" method="POST" role="search">
    {{ csrf_field() }}
    <h2>Search product</h2>
    <div class="input-group">
        <input type = "hidden" name = "_token" value = "<?php echo csrf_token(); ?>">
        <input type="text" class="form-control" name="id"
               placeholder="Enter product"> <span class="input-group-btn">

            <button type="submit" class="btn btn-default">
                <span class="glyphicon glyphicon-search"><i class='fas fa-search'></i></span>
            </button>
        </span>
    </div>
</form>

<table border = "1" style="font-size: 20px;background-color: white;">
    <tr>
        <td style="padding: 15px;">ID</td>
        <td style="padding: 15px;">Product Name</td>
        <td style="padding: 15px;">Price</td>
        <td style="padding: 15px;">Img</td>
    </tr>
    @foreach ($users as $user)
        <tr>
            <td style="padding: 15px;">{{ $user->id }}</td>
            <td style="padding: 15px;">{{ $user->product_name }}</td>
            <td style="padding: 15px;">{{ $user->price}}</td>
            <td style="padding: 15px;">{{ $user->img }}</td>
        </tr>
    @endforeach
</table>
</body>
</html>
