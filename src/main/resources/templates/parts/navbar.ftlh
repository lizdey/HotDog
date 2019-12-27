<#macro nav>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">

            <div class="col-sm-1">
                <img class="ml-3" src="/img/logo/logo.png"alt="Card image" style="width:80% ">
            </div>

            <div class="col-sm-9">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/posts/all">All Posts</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/posts">New Post</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/main">Users List</a>
                    </li>
                </ul>
            </div>

            <div class="col-sm-2">
                <a href="/login" class="btn btn-outline-secondary mx-auto d-block" role="button">Login/Register</a>
            </div>

        </div>
    </nav>
</#macro>