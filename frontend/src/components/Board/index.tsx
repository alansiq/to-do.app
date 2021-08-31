import styled from 'styled-components';
import Column from '../../components/Column';
import Card from '../../components/Card';


const Container = styled.div`

display: flex;

`

type CardTypes = {
    id: number,
    title: string,
    tags: string[],
    description: string,
    status: string,
};

type DataInterface = {
    data: {
        boardName: string,
        boardColumns: string[],
        boardCards: CardTypes[]
    }

};

const Board: React.FC<DataInterface> = (props) => {


    function FilterCards(columnName: string, cardsData: DataInterface) {
        const { boardCards } = cardsData.data;
        console.log(boardCards.filter(c => c.status === columnName))
        return boardCards.filter(c => c.status === columnName)
    }


    return (
        <>

            <Container>
                    {props.data.boardColumns.map(status =>
                            <Column key={status} title={status}>
                                {FilterCards(status, props).map(c => (
                                        <Card cardInfo={c} />
                                ))}
                            </Column>
                    )}
            </Container>


        </>
    )
}

export default Board;