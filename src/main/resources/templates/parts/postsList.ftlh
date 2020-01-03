<div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-8 " style="background-color:lavender;">
                <#list ps as post>
                    <div class="card mb-3 img-fluid" style="width:800px">
                        <div class="card-body" style="background-color: #e5ffea">
                            <h4 class="card-title">${post.postName}</h4>
                            <p class="card-text">${post.postText}</p>

                            <a href="/user-posts/${post.author.id}">${post.authorName}</a>

                            <img class="card-img-bottom mx-auto d-block" src="/img/${post.imgName}" alt="Card image" style="width:75% ">
                        </div>
                    </div>
                </#list>
            </div>
            <div class="col-sm-4" style="background-color:lavenderblush;">
                <p>Nohing for now</p>
            </div>
        </div>
    </div>
</div>