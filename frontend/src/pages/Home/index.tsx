import styled from 'styled-components';
import Board from  '../../components/Board';


const PageTitle = styled.div`
    display: flex;
    flex-direction: column;
    max-width: 566px;

    margin: 62px 0;
    
    h1 {
        font-size: 52px;
        margin: 16px 0;
    }

    p {
        font-size: 16px;
    }
`

const jsonExample = {
    boardName: "tasks",
    boardColumns: ["to-do", "doing", "done"],
    boardCards: [
        {
            id: 0,
            title: "Task full title",
            tags: ["javascript", "nodejs"],
            description: "Bibendum amet, orci consectetur nec. Sit urna, aliquam felis, molestie libero. Tellus, laoreet amet iaculis tincidunt tincidunt.  ",
            status: "to-do"
        },
        {
            id: 1,
            title: "Task full title",
            tags: ["javascript", "nodejs"],
            description: "Bibendum amet, orci consectetur nec. Sit urna, aliquam felis, molestie libero. Tellus, laoreet amet iaculis tincidunt tincidunt.  ",
            status: "to-do"
        },
        {
            id: 2,
            title: "Task full title",
            tags: ["javascript", "nodejs"],
            description: "Bibendum amet, orci consectetur nec. Sit urna, aliquam felis, molestie libero. Tellus, laoreet amet iaculis tincidunt tincidunt.  ",
            status: "to-do"
        },
        {
            id: 3,
            title: "Task full title",
            tags: ["javascript", "nodejs"],
            description: "Bibendum amet, orci consectetur nec. Sit urna, aliquam felis, molestie libero. Tellus, laoreet amet iaculis tincidunt tincidunt.  ",
            status: "done"
        },
        {
            id: 4,
            title: "Task full title",
            tags: ["javascript", "nodejs"],
            description: "Bibendum amet, orci consectetur nec. Sit urna, aliquam felis, molestie libero. Tellus, laoreet amet iaculis tincidunt tincidunt.  ",
            status: "doing"
        },
        {
            id: 5,
            title: "Task full title",
            tags: ["javascript", "nodejs"],
            description: "Bibendum amet, orci consectetur nec. Sit urna, aliquam felis, molestie libero. Tellus, laoreet amet iaculis tincidunt tincidunt.  ",
            status: "doing"
        },
    ]
}

const Home = () => {

    return (
        <>
            <PageTitle>
                <h1>Simple Task Manager</h1>
                <p>Manage your tasks by dragging, or create a new one using the PLUS symbol on each column.</p>
            </PageTitle>

            <Board data={jsonExample} />
        </>
    )
}

export default Home;