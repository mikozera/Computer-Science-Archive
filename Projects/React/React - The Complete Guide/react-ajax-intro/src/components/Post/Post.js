import React from "react";

import "./Post.css";

const post = props => (
  <article className="Post" onClick={props.clickHandler}>
    <h1 style={{ textTransform: "capitalize" }}>{props.title}</h1>

    <div className="Info">
      <div className="Author">{props.author}</div>
    </div>
  </article>
);

export default post;
