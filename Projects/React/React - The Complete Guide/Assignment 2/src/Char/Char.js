import React from "react";

const Char = (props) => {
  const charBoxStyle = {
    display: "inline-block",
    padding: "16px",
    textAlign: "center",
    margin: "16px",
    border: "1px solid black",
  };

  return (
    <div style={charBoxStyle} onClick={props.click}>
      {props.character}
    </div>
  );
};

export default Char;
