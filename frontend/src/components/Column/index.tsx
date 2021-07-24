import React from 'react';
import styled from 'styled-components';

const ColumnContainer = styled.div`

    display: flex;
    flex-direction: column;
    gap: 16px;

    margin-right: 32px;

    width: 376px;

`

type ColumnType = {
    title: string
}


const Column: React.FC<ColumnType> = (props) => {

    return (
        <>
            <ColumnContainer>
                <h3>{props.title}</h3>
                {props.children}
            </ColumnContainer>
        </>
    )
}

export default Column;