<#import "parts/common.ftlh" as comm>
<#import "parts/navbar.ftlh" as navbar>

<@comm.page>
    <@navbar.nav/>
    <div class="container" >
        <div class="row">
            <div class="col-3">
            </div>
            <div class="col-sm">
                <form action="/posts" method="post"  enctype="multipart/form-data">

                    <div class="form-group">
                        <label for="pstName">Name:</label>
                        <input type="pstName" class="form-control" id="pstName" placeholder="Enter name" name="pstName">
                    </div>

                    <div class="form-group">
                        <label for="pstText">Description</label>
                        <textarea class="form-control" id="pstText" rows="3" name="pstText" placeholder="Post description"></textarea>
                    </div>

                    <div class="form-group">
                        <label for="tagStr">Tag</label>
                        <textarea class="form-control" id="tagStr" rows="3" name="tagStr" placeholder="Enter tag"></textarea>
                    </div>

                    <div class="custom-file">
                        <input type="file" class="custom-file-input" id="file", name="file">
                        <label class="custom-file-label" for="file"></label>
                    </div>



                    <input type="hidden" name="_csrf" value="${_csrf.token}"/>

                    <input type="submit" class="btn btn-dark mt-3 mx-auto d-block" value="Create Post"/>

                </form>
            </div>
            <div class="col-3">
            </div>
        </div>
    </div>
</@comm.page>


