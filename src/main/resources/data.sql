INSERT INTO roles (id, name) VALUES (1, 'ADMIN');
INSERT INTO roles (id, name) VALUES (2, 'USER');

INSERT INTO users (id, email, password, role_id) VALUES (4, 'mike@mail.com', '$2a$10$CdEJ2PKXgUCIwU4pDQWICuiPjxb1lysoX7jrN.Y4MTMoY9pjfPALO', 1);
INSERT INTO users (id, email, password, role_id) VALUES (5, 'nick@mail.com', '$2a$10$CJgEoobU2gm0euD4ygru4ukBf9g8fYnPrMvYk.q0GMfOcIDtUhEwC', 2);
INSERT INTO users (id, email, password, role_id) VALUES (6, 'nora@mail.com', '$2a$10$yYQaJrHzjOgD5wWCyelp0e1Yv1KEKeqUlYfLZQ1OQvyUrnEcX/rOy', 2);

INSERT INTO states (id, name) VALUES (1, 'NEW');
INSERT INTO states (id, name) VALUES (2, 'DOING');
INSERT INTO states (id, name) VALUES (3, 'VERIFY');
INSERT INTO states (id, name) VALUES (4, 'DONE');

INSERT INTO todos (id, title, created_at, owner_id) VALUES (1, 'Mike''s To-Do #1', '2020-09-16 14:00:04.810221', 4);
INSERT INTO todos (id, title, created_at, owner_id) VALUES (2, 'Mike''s To-Do #2', '2020-09-16 14:00:11.480271', 4);
INSERT INTO todos (id, title, created_at, owner_id) VALUES (3, 'Mike''s To-Do #3', '2020-09-16 14:00:16.351238', 4);
INSERT INTO todos (id, title, created_at, owner_id) VALUES (4, 'Nick''s To-Do #1', '2020-09-16 14:14:54.532337', 5);
INSERT INTO todos (id, title, created_at, owner_id) VALUES (5, 'Nick''s To-Do #2', '2020-09-16 14:15:04.707176', 5);
INSERT INTO todos (id, title, created_at, owner_id) VALUES (6, 'Nora''s To-Do #1', '2020-09-16 14:15:32.464391', 6);
INSERT INTO todos (id, title, created_at, owner_id) VALUES (7, 'Nora''s To-Do #2', '2020-09-16 14:15:39.16246', 6);

INSERT INTO tasks (id, name, priority, todo_id, state_id) VALUES (1, 'Task #2', 'LOW', 1, 1);
INSERT INTO tasks (id, name, priority, todo_id, state_id) VALUES (2, 'Task #1', 'HIGH', 1, 4);
INSERT INTO tasks (id, name, priority, todo_id, state_id) VALUES (3, 'Task #3', 'MEDIUM', 1, 2);

INSERT INTO todo_collaborator (todo_id, collaborator_id) VALUES (1, 5);
INSERT INTO todo_collaborator (todo_id, collaborator_id) VALUES (1, 6);
INSERT INTO todo_collaborator (todo_id, collaborator_id) VALUES (4, 6);
INSERT INTO todo_collaborator (todo_id, collaborator_id) VALUES (4, 4);
INSERT INTO todo_collaborator (todo_id, collaborator_id) VALUES (6, 5);
INSERT INTO todo_collaborator (todo_id, collaborator_id) VALUES (6, 4);
