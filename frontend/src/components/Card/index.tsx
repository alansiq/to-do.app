import React from "react";
import styled from 'styled-components';

type CardTypes = {
    cardInfo: {
        id: number,
        title: string,
        tags: string[],
        description: string,
        status: string,
    }

};


const CardContainer = styled.div`

display: flex;
flex-direction: column;
align-items: flex-start;
padding: 10px;
gap: 10px;
background: #FFFFFF;
box-shadow: 0px 2px 18px -8px rgba(0, 0, 0, 0.25);
border-radius: 8px;

max-height: 148px;
height: 148px;
overflow: hidden;

user-select: none;
cursor: pointer;

transition: all 0.2s;

&:hover {
    box-shadow: 0px 9px 18px -9px #585B76;
}

.cardTitle {
    display: flex;
    gap: 4px;
    align-items: baseline;

    span {
        font-size: 16px;
        color: #D0D0D0;
    }

    h4 {
    font-family: Roboto, sans-serif;
    color: #585B76;
    font-weight: 400;
    font-size: 18px !important; 
    }

}



p {
    font-size: 16px;
    width: 100%;
    height: 100%;

    cursor: text;

}

[contenteditable='true'] {
    padding: 4px;
    outline: none;
    position: relative;

    &:focus::after {

        content: '';
        position: absolute;

        height: 100%;
        width: 100%;

        top: 0;
        left: 0;

        background: rgba(46, 202, 241, 0.1);
        pointer-events: none;

        cursor: text;
    }
}

`

const TagContainer = styled.div`

display: flex;
gap: 8px;
flex-wrap: nowrap;

small {
    font-family: Roboto, sans-serif;
    background: #30DAFF;
    border-radius: 120px;
    padding: 4px 12px;
    font-size: 12px;
}


`


const Card: React.FC<CardTypes> = ({ cardInfo }) => {

    return (
        <CardContainer>
            <div className="cardTitle">
                <span>{cardInfo.id}</span><h4 contentEditable>{cardInfo.title}</h4>
            </div>
            <TagContainer>
                {cardInfo.tags.map(t => (<small contentEditable key={t}>{t}</small>))}
            </TagContainer>
            <p contentEditable>{cardInfo.description}</p>
        </CardContainer>
    )
}


export default Card;