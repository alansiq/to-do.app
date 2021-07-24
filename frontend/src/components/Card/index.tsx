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

h4 {
    font-family: Roboto, sans-serif;
    color: #585B76;
    font-weight: 400;
    font-size: 18px !important; 
}

p {
    font-size: 16px;
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
            <h4>{cardInfo.id} {cardInfo.title}</h4>
            <TagContainer>
                {cardInfo.tags.map(t => (<small key={t}>{t}</small>))}
            </TagContainer>
            <p>{cardInfo.description}</p>
        </CardContainer>
    )
}


export default Card;