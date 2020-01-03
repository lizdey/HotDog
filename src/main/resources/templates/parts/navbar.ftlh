<#include "security.ftlh">
<#macro nav>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">

            <div class="col-sm-1">
                <img class="ml-3" src="/img/logo/logo.png"alt="Card image" style="width:80% ">
            </div>

            <div class="col-sm-7">
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/posts/all">All Posts</a>
                    </li>
                    <#if known>
                        <li class="nav-item">
                            <a class="nav-link" href="/posts">New Post</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/user-posts/${currentUserId}">My posts</a>
                        </li>
                    </#if>

                </ul>
            </div>

            <#if known>
                <div class="col-sm-2">
                    <div class="navbar-text mx-auto d-block">Logged-in as: ${name}</div>
                </div>
                <div class="col-sm-2">
                    <form action="/logout" method="post">
                        <input type="hidden" name="_csrf" value="${_csrf.token}" />
                        <button type="submit" class="btn btn-outline-secondary mx-auto d-block">Log out</button>
                    </form>
                </div>
            <#else>
                <div class="col-sm-2">
                    <div class="navbar-text mx-auto d-block">You are not logged-in!</div>
                </div>
                <div class="col-sm-2">
                    <a href="/login" class="btn btn-outline-secondary mx-auto d-block" role="button">Login/Register</a>
                </div>
            </#if>

        </div>
    </nav>
</#macro>