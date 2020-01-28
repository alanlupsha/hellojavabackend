Gets a random image from https://jsonplaceholder.typicode.com/photos/

Example hit:
```$xslt
http://localhost:8080/hellojavabackend/
```
example output, gets a random image by id between 1 and 5000:
```$xslt
{
"albumId": 23,
"id": 1126,
"title": "corrupti autem beatae voluptate quam eveniet et quidem",
"url": "https://via.placeholder.com/600/980880",
"thumbnailUrl": "https://via.placeholder.com/150/980880"
}
```

You can also specify the photo id:

```$xslt
http://localhost:8080/hellojavabackend/5
```
returns:
```$xslt
{
"albumId": 1,
"id": 5,
"title": "natus nisi omnis corporis facere molestiae rerum in",
"url": "https://via.placeholder.com/600/f66b97",
"thumbnailUrl": "https://via.placeholder.com/150/f66b97"
}
```

Enjoy!
