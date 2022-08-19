const express = require('express');
const app = express();
const http = require('http');
const { emit } = require('process');
const server = http.createServer(app);
const { Server } = require("socket.io");
const io = new Server(server);

//lado del servidor?
app.get('/', (req, res) => {
    res.sendFile(__dirname + '/index.html');
  });
 
 
io.on("connection", (socket) => {
    socket.on("chat message", (msg) => {
        io.emit("chat message", msg);
      });
  });


  //io.on("connection", (socket) => {
  //  socket.emit("hello", "world");
  //});


  

  server.listen(3001, () => {
    console.log("escuchando en el puerto *:3000");
});

