<#macro register>
    <div class="container">

        <form action="/registration" method="post">
            <div class="form-group">
                <label for="username">User Name:</label>
                <input type="username" class="form-control" id="username" placeholder="Enter User Name" name="username">
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
            </div>
            <div class="form-group">
                <label for="email">E-Mail:</label>
                <input type="text" class="form-control" id="email" placeholder="Enter User a valid E-Mail" name="email">
            </div>
            <div class="form-group">
                <label for="fullName">Full Name:</label>
                <input type="text" class="form-control" id="fullName" placeholder="Enter your full name" name="fullName">
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>
</#macro>

<#macro login>
    <div class="container">

        <form action="/login" method="post" >
            <div class="form-group">
                <label for="username">User Name:</label>
                <input type="username" class="form-control" id="username" placeholder="Enter User Name" name="username">
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" placeholder="Enter Password" name="password">
            </div>
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
            <button type="submit" class="btn btn-primary">Log In</button>
        </form>
    </div>
</#macro>



