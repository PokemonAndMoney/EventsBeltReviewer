<!DOCTYPE html>
<html lang="en">
<head th:replace="fragments::header"></head>
<body>
    <div class="fluid-content">
    	<nav th:replace="fragments::nav"></nav>
    </div>
    
    <!--registration form-->
        <div class="fluid-content">
    	<div th:replace="fragments::messages"></div>
    	<div class="row">
    		<div class="col-12">
    			<form action="/home/register" th:object="${user}" method="POST">
    				<input type="text" th:field="*{email}" placeholder="email" th:errorclass="input_error_highlight">
    				<p th:if="${#fields.hasErrors('email')}" th:errors="*{email}" class="error_message"/>
    				
    				<input type="password" th:field="*{password}" placeholder="password" th:errorclass="input_error_highlight">
    				<p th:if="${#fields.hasErrors('password')}" th:errors="*{password}" class="error_message"/>
    				
    				<input type="password" th:field="*{passConfirm}" placeholder="confirm password" th:errorclass="input_error_highlight">
    				<p th:if="${#fields.hasErrors('passConfirm')}" th:errors="*{passConfirm}" class="error_message"/>
    				
    				 				
					<input type="submit" value="Register" class="btn btn-success"/>
    			</form>
    		</div>
    	</div>
    </div>
</body>
</html>