<%--
  Created by IntelliJ IDEA.
  User: coghk
  Date: 2022-12-02
  Time: 오후 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>레시피 리스트</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax./libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <style>
        .table {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class ="row col-md-7 table-responsive">
            <table class="table" id="dataTable">
                <thead>
                    <tr>
                        <th>NO</th>
                        <th>제목</th>
                        <th>작성자</th>
                    </tr>
                </thead>
            </table>
        </div>
    </div>
</body>
</html>
