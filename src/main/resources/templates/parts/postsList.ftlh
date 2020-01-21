<div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-8 " style="background-color:lavender;">
                <#list ps as post>
                    <div class="card mb-3 img-fluid" style="width:850;margin-top: 10px">
                        <div class="card-body" style="background-color: #e5ffea">
                            <div class="row">
                                <div class="col-sm-9">
                                    <h4 class="card-title">${post.postName}</h4>
                                </div>
                                <div class="col-sm-3">
                                    <p class="card-text">Author:
                                        <a href="/user-posts/${post.author.id}">${post.authorName}</a>
                                    </p>
                                </div>
                                

                            </div>

                            <p class="card-text">${post.postText}</p>


                            <img class="card-img-bottom mx-auto d-block" src="/img/${post.imgName}" alt="Card image" style="width:75% ">
                            <div style="font-size: small">
                                <time>${post.timeStamp}</time>
                            </div>
                        </div>
                    </div>
                </#list>
            </div>
            <div class="col-sm-4" style="background-color:lavender;">
                <div style="position: sticky; top: 0 ; margin-top: 10px ; margin-right: 10px ; margin-right: 10px">
                    <img class="make-me-sticky sidebar-item" src="/img/logo/ad.png" style="display: block ; margin-left: auto; margin-right: auto;  ">
                </div>

            </div>
        </div>
    </div>
</div>