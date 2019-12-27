<#import "parts/common.ftlh" as comm>

<@comm.page>
    <div>
        <form action="/posts" method="post" enctype="multipart/form-data">
            <label for="pstName">Post name</label>
            <input type="text"  name="pstName">


            <label for="pstText">Post text</label>
            <input type="text"  name="pstText">

            <label>Image</label>
            <input type="file" name="file">

            <input type="hidden" name="_csrf" value="{{_csrf.token}}"/>

            <input type="submit" value="Create Post">
        </form>
    </div>
</@comm.page>


