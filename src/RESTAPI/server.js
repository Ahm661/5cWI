const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
const port = 3000;

let persons = [
  {
    id: 1,
    firstname: "John",
    lastname: "Doe",
    age: 25,
  },
  {
    id: 2,
    firstname: "Jane",
    lastname: "Smith",
    age: 30,
  },
  {
    id: 3,
    firstname: "Michael",
    lastname: "Johnson",
    age: 35,
  },
  {
    id: 4,
    firstname: "Emily",
    lastname: "Davis",
    age: 28,
  },
  {
    id: 5,
    firstname: "Chris",
    lastname: "Brown",
    age: 40,
  },
];

app.use(cors());

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.get("/", (req, res) => {
  res.send("Hello World, from Trabzon");
});


app.listen(port, () =>
  console.log(`Hello world app listening on port ${port}!`)
);